public class AddArray {

    int [] array = new int[4];
    int addedValue;
    int averageDays = 3;
    int tempDays;
    void addTempDays(int position, int val){

        addedValue = array[position];
        array[position] = val;

        for (int a = 0; a <array.length; a++){

            if (array[a] == 0) {
                array[a] = Integer.MIN_VALUE;
            }

        }


    }

    void findTempDays(int position){
       tempDays = array[position];
        if (tempDays > averageDays){

            System.out.println("The temperature day" +" "+ tempDays+ " is above the average Day ");
        }
        else {
            System.out.println("The temperature day" +" " +tempDays +" " + "is below the average Day ");
        }
    }
}
