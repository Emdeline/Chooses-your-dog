import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ChooseDog
	{
		static JFrame frame = new JFrame("JFrame Name");
		static int dogSize;
		
		public static void main(String[] args)
			{
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
						String[] newOwner = { "Brand New","Had one as a kid" };

					    String activityLevel = (String) JOptionPane.showInputDialog(frame, 
					            "When was the last time you had any experence with owning a dog?",
					            "Experence Level",
					            JOptionPane.QUESTION_MESSAGE, 
					            null, 
					            newOwner, 
					            newOwner[0]);
					    break;

						}
					case "Yes":
						{
						JOptionPane.showMessageDialog(
								frame, 
								"Great, moving right along.");
						break;
						}
					
					}
				 
				 
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
								"Okay okay a small dog respectable.");
						break;
						}
					case 1:
						{
						JOptionPane.showMessageDialog(
								frame, 
								"Meduim the perfect inbetween.");
						break;
						}
					case 2:
						{
						JOptionPane.showMessageDialog(
								frame, 
								"Large dogs are squish.");
						break;
						
						}
					}
				
				
			    String[] level = { "Active", "Layed Back", "Lazy"};

				    String activityLevel = (String) JOptionPane.showInputDialog(frame, 
				            "What is your activity level?",
				            "Activity Level",
				            JOptionPane.QUESTION_MESSAGE, 
				            null, 
				            level, 
				            level[0]);
				    
				    switch(activityLevel)
					{
					case "Active":
						{
						JOptionPane.showMessageDialog(
								frame, 
								"Yes! Activity is the best!");
						
						String[] activeOwner = { "Running","Hiking", "Biking (easy)" };
						
						 String humanActivityLevel = (String) JOptionPane.showInputDialog(frame, 
						            "What active movemnt do you enjoy the most",
						            "Favorite activity",
						            JOptionPane.QUESTION_MESSAGE, 
						            null, 
						            activeOwner, 
						            activeOwner[0]);
						break;
						}
					case "Layed Back":
						{
						JOptionPane.showMessageDialog(
								frame, 
								"Meduim the perfect inbetween.");
						break;
						}
					case "Lazy":
						{
						JOptionPane.showMessageDialog(
								frame, 
								"Large dogs are squish.");
						break;
						
						}
					 
					}
				 
			}
	}
