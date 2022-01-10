/**
 * 
 */
//8.함수(Fuction)
//서비스를 만들다보면... 같거나 비슷한 동작들이 생기기 마련!
//		팝업, 결제 기능 ...
//자주 사용하는 동작들을 하나로 만들어서 재활용하자!

//function_함수명(파라미터){
	//내용
//}	의 형태이고 함수명(파라미터);로 호출하면 됨

//파라미터가 없는 함수
function showError(){
	alert("에러발생!");
}
showError();

//파라미터가 있는 함수
/*function sayHello(name){
	const msg = 'Hello, ${name}';
	alert(msg)
}
sayHello("Beaver");
sayHello();

function sayHello2(name){
	let msg = "Hello";
	if(name){
		msg += `, ${name}`;
	}
	alert(msg);
}

sayHello2();
sayHello2("hhhh");
*/

let msg = "Welcome";
console.log(msg);
let name = "비버";
function sayHello(name){
	let msg = "Hello";
	console.log(msg+' '+name);
}
sayHello("Beaver");
console.log(msg);

//지역변수는 함수 내에서 전역변수와 같은 이름으로 지을 수 있고
//서로 간섭을 받지 않음

//전역변수가 많아지면 관리가 힘들어지기 때문에
//가능하면 함수에 특화된 지역변수를 이용하자!
 
//OR을 활용해서
function sayHello2(name){
	let newName = name || 'friend';
	let msg = `Hello, ${newName}`;
	console.log(msg);
}
sayHello2();
sayHello2("빕어");

function add(num1, num2){
	return num1+num2;
}
const result = add(2,3);
console.log(result);