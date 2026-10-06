📦 2. Wrapper Class RepresentationWhen using Wrapper classes, primitive values are wrapped inside Objects created on the Heap Memory. The reference variable points to the created Object.   Code Example:JavaCharacter a = new Character('x');
Byte b = new Byte((byte) 10);
Short c = new Short((short) 20);
Integer d = new Integer(30);
Long e = new Long(40L);
Float f = new Float(3.147f);
Double g = new Double(33.3384);
Boolean h = new Boolean(true);
☁️ Memory Layout (Object References):Plaintexta --------> ( 'x' )
b --------> ( 10 )
c --------> ( 20 )
d --------> ( 30 )
e --------> ( 40 )
f --------> ( 3.147 )
g --------> ( 33.3384 )
h --------> ( true )
(Value stored in Object, not in data types)
