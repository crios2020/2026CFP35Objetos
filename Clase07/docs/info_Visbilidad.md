En Java, los modificadores de visibilidad (o acceso) controlan desde dónde se pueden acceder a los miembros de una clase (atributos, métodos, constructores).

Hay 4 niveles de acceso:

🔓 1. public
Alcance: desde cualquier clase en cualquier paquete.
Es el nivel más abierto.
public int edad;

✔ Se puede usar desde:
La misma clase
Otras clases del mismo paquete
Clases en otros paquetes (importando la clase)

🔒 2. private
Alcance: solo dentro de la misma clase.
Es el nivel más restrictivo.
private String nombre;

✔ Solo accesible desde:
La misma clase

❌ No accesible desde:
Subclases
Otras clases (ni siquiera del mismo paquete)

👉 Se suele usar junto con getters/setters.

🟡 3. default (sin modificador)
También llamado package-private.
Alcance: solo dentro del mismo paquete.
int saldo;

✔ Accesible desde:
La misma clase
Otras clases del mismo paquete

❌ No accesible desde:
Clases de otros paquetes

🛡️ 4. protected
Alcance:
Mismo paquete
Subclases (aunque estén en otros paquetes)
protected double sueldo;

✔ Accesible desde:
La misma clase
Clases del mismo paquete
Subclases (incluso en otros paquetes)

❌ No accesible desde:
Clases no relacionadas en otros paquetes


📊 Resumen rápido
Modificador	 Misma clase	Mismo paquete	Subclase (otro paquete)	    Otros paquetes
public	       ✅	          ✅	               ✅	                     ✅
protected	   ✅	          ✅	               ✅	                     ❌
default	       ✅	          ✅	               ❌	                     ❌
private	       ✅	          ❌	               ❌	                     ❌


Que es el encapsulamiento
El encapsulamiento en Java es uno de los principios fundamentales de la programación orientada a objetos (POO). Consiste en ocultar (Estado del objeto) los detalles internos de una clase y controlar el acceso a sus datos.

🧠 Idea clave
En lugar de permitir acceso directo a los atributos, se:

Declaran como private
Se accede a ellos mediante métodos públicos (getters y setters)

📦 ¿Para qué sirve?
El encapsulamiento permite:

🔒 Proteger los datos (evitar modificaciones indebidas)
🎛️ Controlar cómo se modifican
🔄 Cambiar la implementación interna sin afectar el exterior
🧩 Mantener el código más ordenado y mantenible

💻 Ejemplo simple

class Persona {
    private String nombre;
    private int edad;

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 150) { // validación
            this.edad = edad;
        }
    }
}
🔍 ¿Qué está pasando acá?
nombre y edad están en privado (private)
No se pueden modificar directamente desde afuera
Se accede mediante métodos públicos:
getNombre() → obtiene el valor
setEdad() → lo modifica con validación
🚫 Sin encapsulamiento (mala práctica)
class Persona {
    public int edad;
}

👉 Cualquiera podría hacer:

persona.edad = -100; // ❌ dato inválido
✅ Con encapsulamiento
persona.setEdad(-100); // no lo permite ✔
🎯 En resumen

El encapsulamiento es:

Ocultar los datos internos de una clase y permitir acceso controlado mediante métodos.


Que son los getters y setter?
En Java, los getters y setters son métodos que se usan para acceder y modificar los atributos privados de una clase, respetando el principio de encapsulamiento.

🧩 ¿Qué es cada uno?

🔹 Getter
Método que devuelve (lee) el valor de un atributo.
No modifica nada.
public String getNombre() {
    return nombre;
}

🔹 Setter
Método que modifica (escribe) el valor de un atributo.
Puede incluir validaciones.
public void setEdad(int edad) {
    if (edad >= 0) {
        this.edad = edad;
    }
}
📦 Ejemplo completo
class Persona {
    private String nombre;
    private int edad;

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }
}
🔍 ¿Cómo se usan?
Persona p = new Persona();

p.setNombre("Carlos");   // asigna valor
p.setEdad(30);

System.out.println(p.getNombre()); // obtiene valor
🎯 ¿Por qué se usan?
🔒 Protegen los datos (atributos private)
🎛️ Permiten controlar cambios (validaciones)
🔄 Facilitan modificar la lógica interna sin afectar el código externo
🧠 Regla de nombres (convención)
Getter → getAtributo()
Setter → setAtributo()

Ejemplo:

getEdad()
setEdad(int edad)
✅ En resumen

Los getters y setters son métodos que permiten leer y modificar atributos privados de forma controlada. 


Paradigma de la programación de aspectos.
Cuando una linea de código (o fragmento de código) es muy repetitiva, se encuentra repetida en muchos métodos, se la considera un aspecto.
Un aspecto puede no escribirse, y programarse como aspecto, de manera que el
código no es visible pero se escribe en tiempo de ejecución.