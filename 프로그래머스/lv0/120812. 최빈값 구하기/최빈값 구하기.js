function solution(array) {
    let sortedArray = array.sort((a,b) => a-b);
    let cnt = 0;
    
    let bin = -1;
    let binRepeatCnt = 0;
    let repeatCnt = 0;
    let beforeNum = -1;
    let isDubleBin = false;
    while( cnt < array.length) {
        if(beforeNum !== array[cnt]) {
            repeatCnt = 1;
        } else {
            repeatCnt = repeatCnt + 1;
        }
        
        if(repeatCnt === binRepeatCnt) {
            if(bin !== array[cnt]){
                isDubleBin = true;
            }
            
        }
        
        if(repeatCnt > binRepeatCnt) {
            bin = array[cnt];
            binRepeatCnt = repeatCnt;
            isDubleBin = false;
        }
        
        beforeNum = array[cnt];
        cnt = cnt+1;
        
    }
    if(isDubleBin) return -1;   
    return bin;
}


// 1. 앞에서부터 차례대로 원소를 확인하며 갯수를 센다.
// 2. 최빈값을 그때그때 기록한다.