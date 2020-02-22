public class Decrypt {
    public String decrypt(String inMsg, String inKey) {
        StringBuilder outMsg = new StringBuilder();
        if (inKey.length() != 0) {
            int x = 0;
            while (outMsg.length() < inMsg.length()) {
                for (int i = 0; i < inMsg.length(); i++) {
                    if (x == inKey.length()) {
                        x = x - inKey.length() + 1;
                    }
                    char input = (char) ((int) inMsg.charAt(i) - (int) inKey.charAt(x));
                    outMsg.append(input);
                    x++;
                }
            }
        } else {
            outMsg = new StringBuilder(inMsg);
        }
        return outMsg.toString();
    }
}
