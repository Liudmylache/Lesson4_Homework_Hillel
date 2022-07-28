import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;

public class Baby {
    String name;
    String gender;
    String secondName;
    int birthYear;

    public Baby(String name, String gender,String secondName, int birthYear) {
        try {
            this.name = name;
            this.gender = gender;
            this.secondName = secondName;
            this.birthYear = birthYear;

        } catch (NullPointerException ex){
            System.out.println("Exception");
        }
    }

    @Override
    public int hashCode() {
        int hashcode = 0;
        try {
            byte[] name = this.name.getBytes(StandardCharsets.US_ASCII);
            for (byte aByte : name){
                hashcode += aByte;
            }
        } catch (NullPointerException ex){
            System.out.println("You missed a cell");
            System.out.println("Please, make sure you write a real baby name, gender and second name");
            System.exit(0);
    }

        try {
            byte[] gender = this.gender.getBytes(StandardCharsets.US_ASCII);
            for (byte aByte : gender) {
            hashcode += aByte;
        }
        } catch (NullPointerException ex){
            System.out.println("You missed a cell");
            System.out.println("Please, make sure you write a real baby name, gender and second name");
            System.exit(0);
        }

        try {
            byte[] secondName = this.secondName.getBytes(StandardCharsets.US_ASCII);
            for (byte aByte : secondName) {
                hashcode += aByte;
            }
        } catch (NullPointerException ex){
            System.out.println("You missed a cell");
            System.out.println("Please, make sure you write a real baby name, gender and second name");
            System.exit(0);
        }

        try { hashcode *= birthYear;
            if (birthYear <= 0){
                throw new IllegalArgumentException("Negative number or 0 entered");
            }
        } catch (IllegalArgumentException ex){
            System.out.println("Please, make sure you write a real baby year of birth");
            System.exit(0);
        } return hashcode;
    }

        @Override
        public boolean equals (Object obj){
            Baby tempObj = (Baby) obj;
            return (tempObj.name.equals(this.name) && tempObj.gender.equals(this.gender) &&
                    tempObj.secondName.equals(this.secondName) &&
                    tempObj.birthYear == this.birthYear) ? true : false;
        }

        @Override
        public String toString () {
            return "Baby{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", secondName='" + secondName + '\'' +
                    ", birthYear=" + birthYear +
                    '}';
        }
    }
