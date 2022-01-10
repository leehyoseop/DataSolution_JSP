/**
 * 
 */
//9.화살표 함수(***)

//함수 선언문

sayHello();
function sayHello(){
	console.log("Hello");
}
/*sayHello();

let sayHello = function(){
	console.log("Hello");
}
sayHello();
*/
//문법에 어떤 차이가 있을까...? -> '답은 호출하는 타이밍!'
//함수 선언문은 어디서든 호출이 가능함

//JS는 프로그램이 실행전에 모든 함수 선언문을 찾아 한곳에 모아서
//메모리에 저장하고 있다가 필요할때 내부적으로 끌어올려서 사용하는것!
//저장되어 있기 때문에 -> 함수가 먼저 호출되어도 오류없이 잘 작동!
//실제로 코드가 끌어올려진건 아님 + 실제 메모리에도 변화가 없음
//이것을 호이스팅(Hoisting)이라고 함

//함수 표현식은 코드에 도달하면 생성
//그래서 둘중에 뭘 써야? -> 그냥 편한거 쓰시면 되는데
//더 자유롭고 편하게 코딩하고 싶다? -> 함수 선언문!

//화살표 함수
//위에서 봤던 함수들보다 간결하게 작성할 수 있게 해줌!

//1.
let add = function(num1, num2){
	return num1+num2;
}

//2.
var add = (num1, num2) => {
	return num1+num2;
}

//3. return 생략
var add = (num1, num2) => (
	num1+num2
);

//4. 반환할 소스가 한줄이라면...
var add = (num1, num2) => num1+num2;

//5. 파라미터가 하나라면
var sayHello2 = name => `Hello, ${name}!`;
console.log(sayHello2("Beaver"));

//7.return이 있다 하더라도 소스가 여러줄이라면 소괄호 사용 X

//함수 표현식
showError(); //에러 0
let showError = function(){
	console.log("에러!");
}
showError();//에러 X
function showError(){
	console.log("에러!");
}