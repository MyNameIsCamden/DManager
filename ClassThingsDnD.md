+ Money
  - int plat
  - int gold
  - int silver
  - int copper
  
  + getters/setters
  + toString

+ Dice
  - int sides
  - int numberOf
  
  + roll
  + getters/setters

+ Item
  - String name
  - String description
  - double weight
  - Money cost

  + getters/setters
  + toString

+ MultiItem
  - int count
  - int itemPerPound
  
  + getters/setters
  + toString
  + increment
  + increment(int amount)
  + decrement
  + decrement(int amount)
 
+ Weapon
  - String damage
  - String damageType
  - String size
  - int critRange
  - int critValue
  - String weaponType
  - int range
  
  + getters/setters
  
+ Armor
  - int acBonus
  - int maxDexBonus
  - int acPenalty
  - int arcaneSpellFailure
  - int speed
  - int type