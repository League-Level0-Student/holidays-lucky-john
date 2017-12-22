
/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    
 ******************************************************************************/

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;


public class ChristmasTree {

	Robot xmas  = new Robot();
	
    public static void main(String[] args) {
        ChristmasTree ohChristmasTree = new ChristmasTree();
        ohChristmasTree.drawStar();
        ohChristmasTree.drawTreeBody();
        ohChristmasTree.drawTreeTrunk();
    }


    double treeWidth = 15;
    double scale = 1.1;    //This is how much the width of the tree increases with each layer down


    void drawTreeBody() {
        // 8. Change the color of the line the robot draws to forest green    
     xmas.setPenColor(0, 255, 0);

        // 1. Make a variable for turnAmount and set it to 175
    	int turnAmount=175;
        // 2. Start the Robot facing to the right
    	xmas.turn(90);

        // 5. Repeat steps 3 through 11, 11 times

    	for(int threeToEleven =1;threeToEleven<16;threeToEleven += 1){
            // 3. Move the robot the width of the tree
    		xmas.move((int) treeWidth);
            // 4. Turn the robot the current turnAmount to the right
    		xmas.turn(turnAmount);
            // 6. Set the treeWidth to the current treeWidth times the scale
    		treeWidth = treeWidth*scale;
            // 7. Move the robot the width of a tree again
    		xmas.move((int) treeWidth);
            // 9. Turn the robot the current turn amount to the LEFT
    		xmas.turn(-turnAmount);
            // 10. Set the treeWidth to the current treeWidth times the scale again
    		treeWidth = treeWidth*scale;
            // 11. Decrease turnAmount by 1
    		turnAmount-=1;
    		
    	}


}
    
    void drawTreeTrunk() {
        // 1. Move the robot half the width of the tree
    	xmas.move((int)treeWidth/2);
    	

        // 2. Change the robot so that it is pointing straight down
    	xmas.setAngle(180);
    	xmas.penUp();
    	xmas.move(5);
    	xmas.penDown();

        // 4. Set the pen width to the tree width divided by 10
    	xmas.setPenWidth((int)treeWidth/10);

        // 5. Change the color of the line the robot draws to brown
xmas.setPenColor(76, 40, 40);

        // 3. Move the robot a quarter the tree width
    xmas.move((int)treeWidth/4);

    }
    
    void drawStar() {
        // * Optional: Draw a red star on top of the tree. Hint: 144 degrees makes a star.
    	xmas.hide();
    	xmas.setSpeed(1000);
    	xmas.setPenColor(250,255, 0); 	
    	xmas.move(200);
    xmas.penDown();
    	xmas.miniaturize();
    	for(int star=1;star<6;star += 1){
    	xmas.move(50);
    xmas.turn(144);	
    		
    	}
    
    }


}

