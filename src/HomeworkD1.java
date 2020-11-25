public class HomeworkD1 {

    public static void main(String [] args) {
        String text = "gjkdqowucnasjhgqpoiq3ewrpovtnjsdasdgkasjjoiwqjriqwjktkxl#$@!$0ioewakjsbfjkasdnfjwla;erm80oootadasdiasdasd123123asdasdasd123r";
        String fstSum = "";
        String sndSum = "";
        for (int i=0; i<text.length(); i++) {
            String curChar = String.valueOf(text.charAt(i));
            switch (i) {
                case 14:
                case 52:
                case 54:
                    fstSum += curChar;
                    break;
                case 20:
                case 61:
                case 87:
                case 88:
                    sndSum += curChar;
                    break;
                default:
                    System.out.print(curChar);
                    break;
            }
            if(i==100) break;
        }
        System.out.println("\nFinal result: "+fstSum+" "+sndSum);
    }
}
