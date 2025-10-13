public class HR {
    static class Interview {
        public static boolean search(int[] candidates, int referralID) {
            for (int id : candidates) {
                if (id == referralID) {
                    return true;
                }
            }
            return false;
        }
    }
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java HR <referralID> <candidateID1> <candidateID2>...");
            return;
        }
        int referralID = Integer.parseInt(args[0]);
        int[] candidates = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            candidates[i - 1] = Integer.parseInt(args[i]);
        }
        boolean result = Interview.search(candidates, referralID);
        if (result) {
            System.out.println("Referral candidate (ID: " + referralID + ") is present in the list.");
        }
        else {
            System.out.println("Referral candidate (ID: " + referralID + ") is not present in the list.");
        }
    }
}