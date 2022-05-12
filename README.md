# APCS-GameProject
Strategy game revolving around domination over a defined map



AP CS game project planning
Premise:
	Strategy game with defined map and points/cities to take
Features:
	Types of troops:
		-Regular soldiers (armoured?)
	Things to build in those spots:
		-Defensive spot: Fortified position (bunker)
		-Offensive spot: Artillery (missiles)
		-Production spot: Barracks (Army base)
		-Support Production spot: f(industrial factories)
		-Capitol
Possible Structure for Codes: 
	Classes: 
		A mother class that will be extending to all the types of buildings ( points on the map) It should contain variables such as String teamColor, int numSoldier.

		A mother class that will be extending to all the type of soldiers (maybe for later since in the original game it didn't have any, and I think it would be harder to code for what type of building will spawn different type of soldiers) should have variables such as static int healthPoint = 1(if we are only doing one type of soldiers), static int attackDamage = 1; int speed = 10(we will have a method for checking the how big of the group we will change its speed according to the size)

		A class for player, this will contain variable such as int controlledCity; int numFactory; int numsoldiers; boolean conquered(a method that keeps check the size of the player’s territory and if it goes over 70% it will turn into true and the game will end);

	TicTok frame: 
		I think we need to borrow the tictok frame from janetka, since many things depend on it, for example the constant update of the player’s size over the map? Update of the motion of the soldiers moving(if we want to get fancy, not actual soldiers moving but like the process of that big chunk of block moving along the road) 

	Bots? 
		(this will be very hard to design tho… but I think we can do it after all the basic outlines and input some kind of rule that the bot will just follow by every step, like it will check for if border boundary touches another player, if the size of the army>the player army attack or something. If cityarmy> 500 build a factory. Something along those lines)
