/**
 * 
 */

//10.��ü
// �츮�� �������� ����, 3��

const dog = {
	name : "Maru",
	age : 3
}
//��ü�� �߰�ȣ �ȿ��� �����Ǹ�, key��, value������ ������
//������ ��ҵ��� ��ǥ�� �����ϰ�, ��ǥ�� ��� ������ ���߿� �̰����� �����Ұ� ����ϸ�
//��ǥO

//����
console.log(dog.name);
console.log(dog["age"]);

//�߰�
dog.gender = "Male";
dog["furColor"] = "White";

//����
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
//�������� �ʴ� ������Ƽ�� �����ϸ� ���� X, undefined ���� ����
console.log(person.birthday);

//in�����ڸ� ����ϸ� ������Ƽ�� �ִ��� Ȯ���� �� ����
console.log("birthday" in person); //false
console.log("age" in person); //true

//��ü�ȿ� �ִ� �Ӽ� Ȯ��
//for ... in �ݺ���
for(let key in person){
	console.log(key);
	console.log(person[key]);
	console.log("----------");
}

const cat = {
	name : "�����",
	age : 2,
	//¢�� ����� �߰�
	/*bark : function(){
		console.log("�߿�!");
	}*/
	//method : ��ü�� ������Ƽ�� �Ҵ�� �Լ�
	//���� �ִ� bark : function(){} �� �Ʒ�ó�� ������ ���� O
	bark(){
		console.log("�߿�!");
	}
}
cat.bark();
