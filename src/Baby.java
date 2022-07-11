import java.nio.charset.StandardCharsets;
public class Baby {
    String name;
    String gender;
    String secondName;
    int birthYear;

    public Baby(String name, String gender,String secondName, int birthYear) {
        this.name = name;
        this.gender = gender;
        this.secondName = secondName;
        this.birthYear = birthYear;
    }

    @Override
    public int hashCode() {
        int hashcode = 0;
        byte[] name = this.name.getBytes(StandardCharsets.US_ASCII);
        for (byte aByte : name) {
            hashcode += aByte;
        }

        byte[] gender = this.gender.getBytes(StandardCharsets.US_ASCII);
        for (byte aByte : gender) {
            hashcode += aByte;
        }

        byte[] secondName = this.secondName.getBytes(StandardCharsets.US_ASCII);
        for (byte aByte : secondName) {
            hashcode += aByte;
        }
        hashcode *= birthYear;
        return hashcode;
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
