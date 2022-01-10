/**
 * 
 */

//10.객체
// 우리집 강아지는 마루, 3살

const dog = {
	name : "Maru",
	age : 3
}
//객체는 중괄호 안에서 구성되며, key값, value값으로 구성됨
//각각의 요소들은 쉼표로 구분하고, 쉼표가 없어도 되지만 나중에 이것저것 수정할거 고려하면
//쉼표O

//접근
console.log(dog.name);
console.log(dog["age"]);

//추가
dog.gender = "Male";
dog["furColor"] = "White";

//삭제
//delete dog.furColor;
console.log(dog);

const name = "Beaver";
const age = "5";

/*const person = {
	name : name,
	age : age,
	gender : "Male",
}
*/
const person = {
	name,
	age,
	gender : "Male",
}
//존재하지 않는 프로퍼티에 접근하면 에러 X, undefined 값이 나옴
console.log(person.birthday);

//in연산자를 사용하면 프로퍼티가 있는지 확인할 수 있음
console.log("birthday" in person); //false
console.log("age" in person); //true

//객체안에 있는 속성 확인
//for ... in 반복문
for(let key in person){
	console.log(key);
	console.log(person[key]);
	console.log("----------");
}

const cat = {
	name : "고양이",
	age : 2,
	//짖는 기능을 추가
	/*bark : function(){
		console.log("야옹!");
	}*/
	//method : 객체의 프로퍼티로 할당된 함수
	//위에 있는 bark : function(){} 은 아래처럼 생략이 가능 O
	bark(){
		console.log("야옹!");
	}
}
cat.bark();
