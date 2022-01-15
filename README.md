# Lottery-Mockup
This repository is based on a lottery program where users can make a bet and the program returns their gains or losses according to their results.

Purpose of code is to design and implement a program for a lottery game. The principle is as follows: 
At first, the player chooses numbers and the amount of money she wants to bet;
Next, the draw takes place and the gain is computed.
The lottery game, named Tolo, always draws 4 distinct random numbers between 1 and 20 and one additional number (the lucky number) between 1 and 10.
The application must be able to manage 2 different kinds of bets:
1. The « Bet » game: the player chooses 4 numbers between 1 and 20 and bet some fee n.
Players who have found 3 or 4 good numbers win the following amounts:
1. if the player has found 3 good numbers, payout is 5 times the amount n of the bet,
2. if the player has found 4 good numbers, payout is 50 times n.
2. The « Super Bet » game: 4 numbers between 1 and 20 and an additional “lucky” number between 1 and 10, are chosen. Payout is now the following:
1. Payout is identical to the one obtained with the simple Bet if the player does not have found the lucky number
2. Payout is equal to 5 times the payout obtained with the simple Bet game if the player has found the lucky number.
Graphical User Interfaces (JFrame) are expected: the first one allows the user to choose
numbers, bet and launch the Tolo draw, whereas the second one will display the results and
the payout 
