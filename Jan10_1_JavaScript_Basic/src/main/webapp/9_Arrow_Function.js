/**
 * 
 */
//9.ȭ��ǥ �Լ�(***)

//�Լ� ����

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
//������ � ���̰� ������...? -> '���� ȣ���ϴ� Ÿ�̹�!'
//�Լ� ������ ��𼭵� ȣ���� ������

//JS�� ���α׷��� �������� ��� �Լ� ������ ã�� �Ѱ��� ��Ƽ�
//�޸𸮿� �����ϰ� �ִٰ� �ʿ��Ҷ� ���������� ����÷��� ����ϴ°�!
//����Ǿ� �ֱ� ������ -> �Լ��� ���� ȣ��Ǿ �������� �� �۵�!
//������ �ڵ尡 ����÷����� �ƴ� + ���� �޸𸮿��� ��ȭ�� ����
//�̰��� ȣ�̽���(Hoisting)�̶�� ��

//�Լ� ǥ������ �ڵ忡 �����ϸ� ����
//�׷��� ���߿� �� ���? -> �׳� ���Ѱ� ���ø� �Ǵµ�
//�� �����Ӱ� ���ϰ� �ڵ��ϰ� �ʹ�? -> �Լ� ����!

//ȭ��ǥ �Լ�
//������ �ô� �Լ��麸�� �����ϰ� �ۼ��� �� �ְ� ����!

//1.
let add = function(num1, num2){
	return num1+num2;
}

//2.
var add = (num1, num2) => {
	return num1+num2;
}

//3. return ����
var add = (num1, num2) => (
	num1+num2
);

//4. ��ȯ�� �ҽ��� �����̶��...
var add = (num1, num2) => num1+num2;

//5. �Ķ���Ͱ� �ϳ����
var sayHello2 = name => `Hello, ${name}!`;
console.log(sayHello2("Beaver"));

//7.return�� �ִ� �ϴ��� �ҽ��� �������̶�� �Ұ�ȣ ��� X

//�Լ� ǥ����
showError(); //���� 0
let showError = function(){
	console.log("����!");
}
showError();//���� X
function showError(){
	console.log("����!");
}