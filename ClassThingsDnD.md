+ Dice
  - int sides
  - int numberOf
  
  + roll
  + getters/setters

+ Money
  - int plat
  - int gold
  - int silver
  - int copper
  
  + getters/setters
  + toString

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
  - String type
  
+ InventoryManager
  - double totalWeight
  - ArrayList<Item> inventory
  - int actualSpeed  

  + getters/setters
  + addItem
  + removeItem
  + useItem
  + toString
  
+ ItemCompareWeight

+ ItemCompareName

+ Character
  - String name
  - String description  

  + getters/setters
  + toString

+ NonPlayerCharacter
  - String personality

  + getters/setters
  + toString  

+ FightingCharacter
  -

+ PlayerCharacter
  - int[] abilityScores
  - int[] abilityModifiers
  - InventoryManager inventory
  - Class class
  - int level
  - int exp
  - int neededExp
  - int baseSpeed
  - int currentHp
  - int maxHp
  - int ac
  - int touchAc
  - int flatfootedAc
  - Skills[] skills
  - Feat[] feats
  
  + getters/setters
  + toString

+ Skill
  - String name
  - String keyAbility
  - Boolean[] classSkill
  - int ranks
  - int skillMod
  - int miscMod
  
  + getters/setters
  + incrementRank
  + toString

+ Feat
  - String name
  - String description
  
  + getters/setters
  + toString

+ Spell
  - String name
  - String description
  - String components
  - int levelNeeded
  
  + getters/setters
  + toString

+ SpellList
  - Class class
  - int[] spellsPerDay
  - int[] spellsKnown
  
  + castSpell
  + longRest
  + getters/setters
  + toString
  
+ Class
  - TBD
