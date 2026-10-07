        let s = "abccba"
        let target = [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        let charArr = [];
        let i = 0;
        let j = i+1;
       

        while(i<s.length){
            console.log(i)
            if(charArr.includes(s.charAt(i))){
               i++;
               j=i+1;
            }
           else if(s.charAt(i)  == s.charAt(j)){
                    let distance = Math.abs(i-j)-1;
                    console.log(distance)
                  let index = s.charCodeAt(i) - 'a'.charCodeAt(0);
                     console.log(target[index] == distance)
                    if(target[index] != distance){
                        console.log(false)
                        break;
                    }
                    else{
                        charArr.push(s.charAt(i));
                        console.log(charArr)
                        i++;
                        
                    }
                    j++;
            }
            else{
                j++
            }
        }
        console.log("true")
        