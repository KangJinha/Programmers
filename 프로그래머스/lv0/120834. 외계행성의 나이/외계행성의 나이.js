function solution(age) {
    let alpha  = {
        0 : "a",
        1 : "b",
        2 : "c",
        3 : "d",
        4 : "e",
        5 : "f",
        6 : "g",
        7 : "h",
        8 : "i",
        9 : "j"  
    }
    
    let newAge = age + "";
    return newAge.split("").map(x => alpha[x]).join("");
    //alpha배열의 x값에 해당하는 알파벳이 나온다.
}