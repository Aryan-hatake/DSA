   
        let charArr = [];
        let i = 0;
        let j = i+1;
       

        while(i<s.length){
            if(charArr.includes(s.charAt(i))){
               i++;
               j=i+1;
            }
           else if(s.charAt(i) == s.charAt(j)){
                    let distance = Math.abs(i-j)-1;
                  let index = s.charCodeAt(i) - 'a'.charCodeAt(0);
                
                    if(target[index] != distance) return false;
                    else{
                        charArr.push(s.charAt(i));
                        i++;
                        
                    }
            }
            j++;
        }
        return true;