//JavaScrpit
//	1.변수
//변수에 접근하는 방법
//	-alert() : 경고창을 띄우는 함수
//	-console.log() : 로그를 띄우는 함수

// name = "Beaver";
// age = 30; -> 이런 방식은 위험함
// 이를 방지하기 위해서 변수 선언에는 3가지 방법
//	var / let / const 

//	var : var(iable)
//	중복해서 선언 + 초기화도 가능
var a = 10; // 변수 선언 + 초기화
alert(a);
console.log(a);

var a = 20; // 변수 선언 + 초기화
console.log(a); // -> 20
var a; // -> 변수 선언 : 마지막에 할당된 값이 변수에 저장
console.log(a); // -> 20
//		=> 기존에 선언해둔 변수를 까먹고 값을 다시 할당하는 실수가 있을 수도... 

//	let : java 변수 지을때 같은 느낌
let name = "Hyoseop";
console.log(name);
//let name = "aaaa";
console.log(name); // 이미 name이 Beaver로 선언되어 있기 때문에 에러가 발생!

// let은 한번 선언후에 값을 바꿔줄 수 있는데
let grade = "F";
grade = "A+";

// const : 절대로 바뀌지 않는 상수
//		수정이안되며, 수정하려고 하면 에러가 발생!
//		const 변수명은 대문자로 입력!

const PI = 3.121592;
alert(PI);

// 정리
// JS에서 변수를 선언할때 
//	변할 수 있는 값 - var, let으로 선언
//	변하지 않는 값 - const로 선언 

//(Tip!) 모든 변수를 const로 선언 -> 나중에 변경될 여지가 있다면 -> var, let

//변수명 조건!
//	1.변수는 문자와 숫자, $,_만 사용
