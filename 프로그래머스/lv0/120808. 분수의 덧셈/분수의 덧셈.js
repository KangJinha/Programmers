function solution(numer1, num1, numer2, num2) {
    let topNum = (numer1 * num2) + (numer2 * num1);
    let btmNum = num1 * num2;
    let maxNum = 1
    
    for(let i=2; i<= topNum; i++){
        if(topNum % i === 0 && btmNum % i === 0){
            maxNum = i;
        }
    }

    return [topNum/maxNum, btmNum/maxNum];
}

