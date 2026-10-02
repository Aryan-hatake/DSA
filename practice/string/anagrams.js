function isAnagram(s1, s2) {
   let frequency = {}

   for(let i =0;i<s1.length;i++){
       frequency[s1[i]] = (frequency[s1[i]] || 0) + 1
   }
   for(let i = 0;i<s2.length;i++){
       frequency[s2[i]] = (frequency[s2[i]] || 2) - 1
   }
   let isAnagram = true;
   for(const value of Object.values(frequency)){
       if(value>0) {
        return false;
       }
   }

   return isAnagram

}