package party.imata.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import party.imata.player.PlayerClass;

public class SqlitePull
{
	public static void main(String[] args)
	{
		Connection connection = null;
        try
        {
          // create a database connection
          connection = DriverManager.getConnection("jdbc:sqlite:data/dnd35.db");
          Statement statement = connection.createStatement();
          statement.setQueryTimeout(30);  // set timeout to 30 sec.
          
          ResultSet rs = statement.executeQuery("select * from class");
          
          PlayerClass[] classTest = new PlayerClass[54];
    	  int x = 0;
          while(rs.next())
          {
        	  x = x + 1;
        	  classTest[x] = new PlayerClass(rs.getString("name"),rs.getString("alignment"), Integer.parseInt(rs.getString("hit_die").substring(1)));
        	  System.out.println(classTest[x] + "\n");
          }
        }
        catch(SQLException e)
        {
          // if the error message is "out of memory", 
          // it probably means no database file is found
          System.err.println(e.getMessage());
        }
        finally
        {
          try
          {
            if(connection != null)
              connection.close();
          }
          catch(SQLException e)
          {
            // connection close failed.
            System.err.println(e);
          }
        }
    }

}

