function characterFrequency(str) {
   let frequency = {};

   let sortStr = str.split("").sort().join("");
   
   function isCharLetter(char) {
  
  return typeof char === 'string' && char.length === 1 && /^[a-zA-Z]$/.test(char);
}


   for(let i = 0; i<sortStr.length;i++){
         let char =  sortStr[i]
         if(isCharLetter(char))
         frequency[char] = (frequency[char] || 0) + 1
   }

   for(const [key,value] of Object.entries(frequency)){
      console.log(`${key}: ${value}`)
   }
}