function capitalizeEnds(str) {
    let strArr = str.split(" ");

    for(let i =0;i<strArr.length;i++){
        
        let wordArr = strArr[i].split("")

        let capitalStart = wordArr[0].toUpperCase()
        let capitalEnd = wordArr[wordArr.length-1].toUpperCase()

        wordArr[0] = capitalStart
        wordArr[wordArr.length-1] = capitalEnd

        strArr[i] = wordArr.join("")
    }

    return strArr.join(" ")
}