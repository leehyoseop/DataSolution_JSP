/**
 * aaaa
 */
//4. 형 변환

// String(값) -> 문자형으로 변환
// Number(값) -> 숫자형으로 변환
// Boolean(값) -> 논리형으로 변환

// 형 변환은 왜? 필요할까요?!
//	 자료형이 다른 두 변수를 계산했을때 원하는 결과가 나오지 않을 수도 있기 때문에!

// 수학 , 영어 점수를 입력받아서 평균을 구하는 프로그램
const Math = prompt("수학점수를 입력해 주세요");
const English = prompt("영어점수를 입력해 주세요");

//prompt로 받은 값은 무조건!!! '문자형'
//그래서 "80" + "90" = 170(x), "8090"(o)
//문자형 8090인데 계산이 됐음!
//숫자형이 아니더라도 표현식은 숫자형으로 자동으로 변환되어서 계산됨

//자동형변환이 좋아보일수는 있지만...
//원인을 찾기 힘든 에러를 발생시킬수도!!
//형 변환을 할때는 항상 의도를 가지고 원하는 타입으로 변환해주는 것이 좋음!
//'명시적 형 변환'이라고 함

//String() : S는 당연히 대문자 -> 괄호안에 있는 값을 문자형으로 바꿔줌!
const math = 80;
const english = 100;
const average = (math + english)/2;
alert(average);
alert((Number(Math)+Number(English))/2);
alert((Number(Math + English))/2);

console.log(
	String(3), 
	String(true),
	String(false),
	String(null),
	String(undefined)		
);

//Number() : N도 역시나 대문자! -> 괄호안에 있는 값을 숫자형으로 바꿔줌

console.log(
	Number("1234"),
	Number("asdf"),
	Number(true),
	Number(false)
);

//Boolean() : B도 대문자로 입력 -> 괄호 안에 있는 값을 논리형으로 바꿔줌
//false
//	-숫자 0 / 빈 문자열("") / null / undefined / NaN
//이외에는 모두 true값이 됨

console.log(
	Boolean(0),
	Boolean(""),
	Boolean(null),
	Boolean(undefined),
	Boolean(NaN)
);

//주의 사항 -> 이거는 뭐라 설명할 수 없어서...
Number(null)	//0
Number(undefined)	//NaN
const a = Number(prompt("aaaa"));	//확인 혹은 취소 -> 아무런 값도 넣지 않아서 Null

Boolean(0);	//false
Boolean('0'); //true
Boolean(''); //false
Boolean(" "); //true



