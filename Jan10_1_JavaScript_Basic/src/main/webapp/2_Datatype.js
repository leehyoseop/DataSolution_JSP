/**
 * 
 */
//2. �ڷ���
//	-> ������ : String
const name1 = "Beaver";
const name2 = 'Beaver';
const name3 = `Beaver`; //backtick
const message1 = "I'm a boy.";
const message2 = 'I\'m a boy.';// \�� �־��ָ� Ư�����ڷ� �ν�
const message3 = `My name is ${name1}`;

//���ڿ� ���ο� ������ ǥ���Ҷ� ����ϸ����� backtick!
//${������}�� �־ ǥ������
//const message;
//alert(message3);

//���(ǥ����)�� ����� ����
const message5 = `I am ${100+1} years old`;
alert(message5);
//	-> ������ : Number
const age = 100;
const PI = 3.14;
// ���ó� ��Ģ���� ����
//	-> ���� : Boolean
//	-> null, undefined,  : String
alert(1+2);
alert(10-2);
alert(1*2);
alert(6/2);

const a = 1/0; //0���� ������?
console.log(a); //infinity(���Ѵ�)

const b = name1/2;
console.log(b); // Nan(Not a Number : ���ڰ� �ƴϴ�)

//���ڳ��� �̾��ֱ� ����
const aa = "���� ";
const bb = "��ȿ�� �Դϴ�."
console.log(aa + name1 + bb + '��');

//���� : boolean
const c = true;
const d = false;

console.log(name1 == "Beaver");
console.log(age < 30);

// null, undefined(���� �Ҵ�������� ����)
let e;
console.log(e);

//let f = null;(�������� �ʴ� ��)
//console.log(f);

//	typeof ������ : ������ �ڷ����� �� �� ����.
console.log(typeof name1);
console.log(typeof age);
console.log(typeof c);
