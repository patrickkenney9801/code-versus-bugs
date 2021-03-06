package clientfiles;

//import java.awt.Toolkit;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
/**MyImages.java
 * Holds static BufferedImage variables for use in the other classes.
 * @author Ahmadul
 * 
 * ----------------------------------------------------------------------
 * 
 * Copyright 2014 Adel Hassan and Patrick Kenney
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class MyImages 
{
	//frames and buttons
	public static BufferedImage miniMinion;
	public static BufferedImage play;
	public static BufferedImage pause;
	public static BufferedImage fastForwardOff;
	public static BufferedImage fastForwardOn;
	public static BufferedImage redArrow;
	//malware
	public static BufferedImage minion;
	public static BufferedImage wormHead;
	public static BufferedImage wormBody;
	//towers
	public static BufferedImage dt0;
	public static BufferedImage dt1;
	public static BufferedImage dt2;
	public static BufferedImage dt3;
	public static BufferedImage dt4;
	public static BufferedImage dt5;
	public static BufferedImage invalidDT;
	public static BufferedImage random;
	public static BufferedImage randomlethal;
	public static BufferedImage random0;
	public static BufferedImage random1;
	public static BufferedImage random2;
	public static BufferedImage random3;
	public static BufferedImage random4;
	public static BufferedImage random5;
	public static BufferedImage random6;
	public static BufferedImage random7;
	public static BufferedImage random8;
	public static BufferedImage random9;
	public static BufferedImage invalidRandom;
	//projectiles
	public static BufferedImage cd;
	public static BufferedImage r0;
	public static BufferedImage r1;
	public static BufferedImage r2;
	public static BufferedImage r3;
	public static BufferedImage r4;
	public static BufferedImage r5;
	public static BufferedImage r6;
	public static BufferedImage r7;
	public static BufferedImage r8;
	public static BufferedImage r9;
	public static BufferedImage r0lethal;
	public static BufferedImage r1lethal;
	public static BufferedImage r2lethal;
	public static BufferedImage r3lethal;
	public static BufferedImage r4lethal;
	public static BufferedImage r5lethal;
	public static BufferedImage r6lethal;
	public static BufferedImage r7lethal;
	public static BufferedImage r8lethal;
	public static BufferedImage r9lethal;
	//map
	public static BufferedImage cpu;
	public static BufferedImage modem;
	public static BufferedImage router;
	
	/**
	 * I believe I need the method due to the need for a try-catch
	 * 
	 */
	public static void initializeImages()
	{
		try
		{
			//frames and buttons
			miniMinion = ImageIO.read(MyImages.class.getResourceAsStream("resources/cvb_icon.png"));
			pause = ImageIO.read(MyImages.class.getResourceAsStream("resources/pausePauseButton.png"));
			play 			= ImageIO.read(MyImages.class.getResourceAsStream("resources/playPauseButton.png"));
			fastForwardOff 	= ImageIO.read(MyImages.class.getResourceAsStream("resources/FastForwardOff.png"));
			fastForwardOn 	= ImageIO.read(MyImages.class.getResourceAsStream("resources/FastForwardOn.png"));
			redArrow = ImageIO.read(MyImages.class.getResourceAsStream("resources/redArrow.png"));
			
			//malware
			minion = ImageIO.read(MyImages.class.getResourceAsStream("resources/virus2.png"));
			wormHead = ImageIO.read(MyImages.class.getResourceAsStream("resources/wormHead.png"));
			wormBody = ImageIO.read(MyImages.class.getResourceAsStream("resources/wormBody.png"));
			
			//towers
			dt0 = ImageIO.read(MyImages.class.getResourceAsStream("resources/discThrower0.png"));
			dt1 = ImageIO.read(MyImages.class.getResourceAsStream("resources/discThrower1.png"));
			dt2 = ImageIO.read(MyImages.class.getResourceAsStream("resources/discThrower2.png"));
			dt3 = ImageIO.read(MyImages.class.getResourceAsStream("resources/discThrower3.png"));
			dt4 = ImageIO.read(MyImages.class.getResourceAsStream("resources/discThrower4.png"));
			dt5 = ImageIO.read(MyImages.class.getResourceAsStream("resources/discThrower5.png"));
			invalidDT = ImageIO.read(MyImages.class.getResourceAsStream("resources/invalidDiscThrower1.png"));
			random = ImageIO.read(MyImages.class.getResourceAsStream("resources/random.png"));
			randomlethal = ImageIO.read(MyImages.class.getResourceAsStream("resources/randomlethal.png"));
			random0 = ImageIO.read(MyImages.class.getResourceAsStream("resources/random0.png"));
			random1 = ImageIO.read(MyImages.class.getResourceAsStream("resources/random1.png"));
			random2 = ImageIO.read(MyImages.class.getResourceAsStream("resources/random2.png"));
			random3 = ImageIO.read(MyImages.class.getResourceAsStream("resources/random3.png"));
			random4 = ImageIO.read(MyImages.class.getResourceAsStream("resources/random4.png"));
			random5 = ImageIO.read(MyImages.class.getResourceAsStream("resources/random5.png"));
			random6 = ImageIO.read(MyImages.class.getResourceAsStream("resources/random6.png"));
			random7 = ImageIO.read(MyImages.class.getResourceAsStream("resources/random7.png"));
			random8 = ImageIO.read(MyImages.class.getResourceAsStream("resources/random8.png"));
			random9 = ImageIO.read(MyImages.class.getResourceAsStream("resources/random9.png"));
			invalidRandom = ImageIO.read(MyImages.class.getResourceAsStream("resources/invalidRandom.png"));
			
			//projectiles
			cd = ImageIO.read(MyImages.class.getResourceAsStream("resources/cd.png"));
			r0 = ImageIO.read(MyImages.class.getResourceAsStream("resources/r0.png"));
			r1 = ImageIO.read(MyImages.class.getResourceAsStream("resources/r1.png"));
			r2 = ImageIO.read(MyImages.class.getResourceAsStream("resources/r2.png"));
			r3 = ImageIO.read(MyImages.class.getResourceAsStream("resources/r3.png"));
			r4 = ImageIO.read(MyImages.class.getResourceAsStream("resources/r4.png"));
			r5 = ImageIO.read(MyImages.class.getResourceAsStream("resources/r5.png"));
			r6 = ImageIO.read(MyImages.class.getResourceAsStream("resources/r6.png"));
			r7 = ImageIO.read(MyImages.class.getResourceAsStream("resources/r7.png"));
			r8 = ImageIO.read(MyImages.class.getResourceAsStream("resources/r8.png"));
			r9 = ImageIO.read(MyImages.class.getResourceAsStream("resources/r9.png"));
			r0lethal = ImageIO.read(MyImages.class.getResourceAsStream("resources/r0lethal.png"));
			r1lethal = ImageIO.read(MyImages.class.getResourceAsStream("resources/r1lethal.png"));
			r2lethal = ImageIO.read(MyImages.class.getResourceAsStream("resources/r2lethal.png"));
			r3lethal = ImageIO.read(MyImages.class.getResourceAsStream("resources/r3lethal.png"));
			r4lethal = ImageIO.read(MyImages.class.getResourceAsStream("resources/r4lethal.png"));
			r5lethal = ImageIO.read(MyImages.class.getResourceAsStream("resources/r5lethal.png"));
			r6lethal = ImageIO.read(MyImages.class.getResourceAsStream("resources/r6lethal.png"));
			r7lethal = ImageIO.read(MyImages.class.getResourceAsStream("resources/r7lethal.png"));
			r8lethal = ImageIO.read(MyImages.class.getResourceAsStream("resources/r8lethal.png"));
			r9lethal = ImageIO.read(MyImages.class.getResourceAsStream("resources/r9lethal.png"));
			
			//map
			cpu = ImageIO.read(MyImages.class.getResourceAsStream("resources/cpu.png"));
			modem = ImageIO.read(MyImages.class.getResourceAsStream("resources/modem1.png"));
			router = ImageIO.read(MyImages.class.getResourceAsStream("resources/router1.png"));
		}
		catch(Exception e)
		{
			System.out.println("there was an error in loading images");
			JOptionPane.showMessageDialog(null, "there was an error in loading images");
			e.printStackTrace();
		}
	}
}
