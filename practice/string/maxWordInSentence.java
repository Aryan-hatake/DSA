class maxWordInSentence{
    public static void main(String[] args){
          
        int max = 0;

        for(int i = 0;i<sentences.length;i++){
            String[] singleSentence = sentences[i].split(" ");
            if(max < singleSentence.length) max = singleSentence.length;
        }

        System.out.println(max);
    }
}