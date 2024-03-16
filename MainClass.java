public class MainClass {
    public static void main(String[] args) {
                String names = "Azima";
                char[] namesChar = new char[names.length()];
                for (int i = 0; i < names.length(); i++) {
                    namesChar[i] = names.charAt(i);
                    if (namesChar[i] >= 'a' && namesChar[i] <= 'z') { 
                        namesChar[i] = (char) (namesChar[i] - 32);
                    }
                    System.out.println(namesChar[i] + " ");
                }
            }
        }
    
   