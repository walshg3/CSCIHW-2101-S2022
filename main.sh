clear
cd /home/runner/CSCI-2101-S2022
printf "Compiling..."
# This line needs to be changed to whatever folder 
# you are running code out of
javac HW2/*.java 
if [ $? == 0 ] 
then
    clear
    # This line needs to be changed based off the name of the 
    # java file that has the main method
    java HW2.MathGames
else
    printf "\n\n\nError - Exit code $?"
fi