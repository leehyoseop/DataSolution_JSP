/**
 * 
 */
//8.�Լ�(Fuction)
//���񽺸� ����ٺ���... ���ų� ����� ���۵��� ����� ����!
//		�˾�, ���� ��� ...
//���� ����ϴ� ���۵��� �ϳ��� ���� ��Ȱ������!

//function_�Լ���(�Ķ����){
	//����
//}	�� �����̰� �Լ���(�Ķ����);�� ȣ���ϸ� ��

//�Ķ���Ͱ� ���� �Լ�
function showError(){
	alert("�����߻�!");
}
showError();

//�Ķ���Ͱ� �ִ� �Լ�
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
let name = "���";
function sayHello(name){
	let msg = "Hello";
	console.log(msg+' '+name);
}
sayHello("Beaver");
console.log(msg);

//���������� �Լ� ������ ���������� ���� �̸����� ���� �� �ְ�
//���� ������ ���� ����

//���������� �������� ������ ��������� ������
//�����ϸ� �Լ��� Ưȭ�� ���������� �̿�����!
 
//OR�� Ȱ���ؼ�
function sayHello2(name){
	let newName = name || 'friend';
	let msg = `Hello, ${newName}`;
	console.log(msg);
}
sayHello2();
sayHello2("����");

function add(num1, num2){
	return num1+num2;
}
const result = add(2,3);
console.log(result);