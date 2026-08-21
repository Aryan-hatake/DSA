class otp{
    public static void main(String[] args) {

        int digits = 4;

        int start = 1001;

        int end = 9999;

        int otp = generateOtp(digits,start,end);

        System.out.println(otp);

    }

    static int generateOtp(int digits, int start, int end){

        double otp = (Math.random()*end);

        if(otp < start ){
            otp+=start;
        }
        return (int) otp;
    }
}