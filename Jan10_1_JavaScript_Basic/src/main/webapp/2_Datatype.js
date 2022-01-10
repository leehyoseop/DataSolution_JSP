/**
 * 
 */
//2. 자료형
//	-> 문자형 : String
const name1 = "Beaver";
const name2 = 'Beaver';
const name3 = `Beaver`; //backtick
const message1 = "I'm a boy.";
const message2 = 'I\'m a boy.';// \를 넣어주면 특수문자로 인식
const message3 = `My name is ${name1}`;

//문자열 내부에 변수를 표현할때 사용하면좋은 backtick!
//${변수명}을 넣어서 표현하자
//const message;
//alert(message3);

//계산(표현식)도 사용이 가능
const message5 = `I am ${100+1} years old`;
alert(message5);
//	-> 숫자형 : Number
const age = 100;
const PI = 3.14;
// 역시나 사칙연산 가능
//	-> 논리형 : Boolean
//	-> null, undefined,  : String
alert(1+2);
alert(10-2);
alert(1*2);
alert(6/2);

const a = 1/0; //0으로 나누면?
console.log(a); //infinity(무한대)

const b = name1/2;
console.log(b); // Nan(Not a Number : 숫자가 아니다)

//글자끼리 이어주기 가능
const aa = "나는 ";
const bb = "이효섭 입니다."
console.log(aa + name1 + bb + '살');

//논리형 : boolean
const c = true;
const d = false;

console.log(name1 == "Beaver");
console.log(age < 30);

// null, undefined(값이 할당되지않은 상태)
let e;
console.log(e);

//let f = null;(존재하지 않는 값)
//console.log(f);

//	typeof 연산자 : 변수의 자료형을 알 수 있음.
console.log(typeof name1);
console.log(typeof age);
console.log(typeof c);
