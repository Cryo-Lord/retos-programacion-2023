
function traducir(palabra) {

    const diccionario = new Map();  
    const abecedario = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'];
    const l337 = ["4","I3","[",")","3","|=","&","#","1",",_|",">|","1","/\\/\\","^/","0","|*","(_,)","I2","5","7","(_)","\\/","\\/\\/","><","j","2"];
    let traducido = "";

    for (let i = 0; i < abecedario.length; i++) {  
        diccionario.set(abecedario.at(i),l337.at(i));
    }

    for (let l = 0; l < palabra.length; l++) {

        traducido += diccionario.get(palabra.toLowerCase().charAt(l));
    }

    return traducido
}

console.log(traducir("Sample"))