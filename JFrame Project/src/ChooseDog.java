import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.ImageIcon;

public class ChooseDog
	{
		static JFrame frame = new JFrame("JFrame Name");
		static int dogSize;
		static ImageIcon icon1;
		static ImageIcon icon2;
		static ImageIcon icon3;
		static ImageIcon icon4;
		static ImageIcon icon5;
		static ImageIcon icon6;
		static ImageIcon icon7;

		
		public static void main(String[] args)
			{
				icon1 = new ImageIcon(("Basset Hound.jpg"));
				icon2 = new ImageIcon(("Collie.jpg"));
				icon3 = new ImageIcon(("Corgi.jpg"));
				icon4 = new ImageIcon(("Golden Retreaver.jpg"));
				icon5 = new ImageIcon(("Huskey.jpg"));
				icon6 = new ImageIcon(("Leonburgar.jpg"));
				icon7 = new ImageIcon(("Mutt.jpg"));


				String[] experence = { "No", "Yes" };
				 
				 String dogExperence = (String) JOptionPane.showInputDialog(frame, "Have you had a dog before?",
						"Dog activity Level", JOptionPane.QUESTION_MESSAGE, 
			            null, 
			            experence, 
			            experence[0]);
				 
				 switch(dogExperence)
					{
					case "No":
						{
						JOptionPane.showMessageDialog(
								frame, 
								"Okay then lets start at the begining");
						//String[] newOwner = { "Brand New","Had one as a kid" };

					    //String activityLevel = (String) JOptionPane.showInputDialog(frame, 
					      //      "When was the last time you had any experence with owning a dog?",
					        //    "Experence Level",
					          //  JOptionPane.QUESTION_MESSAGE, 
					            //null, 
					            //newOwner, 
					            //newOwner[0]);
					    
					    Object[] options = {"Small", "Meduim", "Large"};
						dogSize = JOptionPane.showOptionDialog(
								frame, 
								"What size would you want your dog to be?",
								"Your prefered dog size is",
								JOptionPane.YES_NO_CANCEL_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null, 
								options, 
								options[2]);
						
						  switch(dogSize)
							{
							case 0:
								{
								JOptionPane.showMessageDialog(
										frame, 
										"You should look for a Corgi. They are easy to take care of as long as you brush them.",
										" ",
										JOptionPane.QUESTION_MESSAGE, icon3);
								break;
								}
							case 1:
								{
								JOptionPane.showMessageDialog(
										frame, 
										"Since you have very little experiene a good starting point would be the Golden Retreaver.", " ",
										JOptionPane.QUESTION_MESSAGE, icon4);
								break;
								}
							case 2:
								{
								JOptionPane.showMessageDialog(
										frame,
										"Since you want a large dog and you have had very little experience you should look for a Leonburger. Just rember to groom it regularly and to go on walks.", " ",
										JOptionPane.QUESTION_MESSAGE, icon6);
								break;
								
								}
							}

					    break;

						}
					case "Yes":
						{
						JOptionPane.showMessageDialog(
								frame, 
								"Great, moving right along.");
						Object[] options = {"Small", "Meduim", "Large"};
						dogSize = JOptionPane.showOptionDialog(
								frame, 
								"What size would you want your dog to be?",
								"Your prefered dog size is",
								JOptionPane.YES_NO_CANCEL_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null, 
								options, 
								options[2]);
						
						  switch(dogSize)
							{
							case 0:
								{
								JOptionPane.showMessageDialog(
										frame, 
										"Get a Basset Hound! They have floppy ears! And they are loud but aborable!",
										" ",
										JOptionPane.QUESTION_MESSAGE, icon1);
								break;
								}
							case 1:
								{
								JOptionPane.showMessageDialog(
										frame, 
										"You should get a type of Collie. They are laid back, hard working and loyal! Just make sure to brush them regularlly.",
										" ",
										JOptionPane.QUESTION_MESSAGE, icon2);
								break;
								}
							case 2:
								{
								JOptionPane.showMessageDialog(
										frame, 
										"Since you have had exerence owning a dog you should get a Huskey. They are loud loveable creatures you cant go wrong!",
										" ",
										JOptionPane.QUESTION_MESSAGE, icon5);
								break;
								
								}
								// JOptionPane.showMessageDialog(frame, 
								 //          "Find the right dog for your life and perosonality.", " ",
								 //           "Highly recomend apopting!", JOptionPane.QUESTION_MESSAGE, icon7);
							}

						break;
						}
					}
				
			 //   String[] level = { "Active", "Layed Back", "Lazy"};

				//    String activityLevel = (String) JOptionPane.showInputDialog(frame, 
				//            "What is your activity level?",
				//            "Activity Level",
				//            JOptionPane.QUESTION_MESSAGE, 
				//            null, 
				//            level, 
				//            level[0]);
				    
				   // switch(activityLevel)
					//{
					//case "Active":
					//	{
						//JOptionPane.showMessageDialog(
							//	frame, 
							//	"Yes! Activity is the best!");
						
					//	String[] activeOwner = { "Running","Hiking", "Biking (easy)" };
						
					//	 String humanActivityLevel = (String) JOptionPane.showInputDialog(frame, 
					//	            "What active movemnt do you enjoy the most",
					//	            "Favorite activity",
					//	            JOptionPane.QUESTION_MESSAGE, 
					//	            null, 
					//	            activeOwner, 
					//	            activeOwner[0]);
					//	break;
					//	}
					//case "Layed Back":
					//	{
					//	JOptionPane.showMessageDialog(
					//			frame, 
					//			"Meduim the perfect inbetween.");
					//	break;
					//	}
					//case "Lazy":
					//	{
					//	JOptionPane.showMessageDialog(
					//			frame, 
					//			"It's always nice to not do anything.");
					//	break;
						
					//	}
					 
					//}				 
			}
	}
