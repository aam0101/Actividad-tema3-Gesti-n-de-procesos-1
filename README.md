# 📘 Práctica Evaluable – Ejercicio 1

Este proyecto contiene dos aplicaciones en **Java** que trabajan con números mediante entrada/salida estándar.  
El objetivo es aprender a compilar, ejecutar, redirigir datos y usar **tuberías (`|`)** en la terminal.

---

## ✨ Contenido del proyecto

- 🔢 **`ordenarNumeros`**  
  Programa que recibe números por la entrada estándar, los ordena y los muestra en pantalla.  

- 🎲 **`aleatorios`**  
  Programa que genera **40 números aleatorios** entre 0 y 100 y los imprime por la salida estándar.  

- 📄 **Manual (HowTo)**  
  Documento con pasos, explicaciones y capturas de las pruebas realizadas.  

---

## 🗂️ Estructura

```bash
practica1/
├── pom.xml                 # Configuración Maven               
├── README.md               # Este archivo
├── docs/
└── src/
    └── main/
        └── java/
            └── com/
                └── ejercicio/
                    └── aleatorios.java

practica2/
├── pom.xml                 # Configuración Maven
├── README.md               # Este archivo
├── docs/
└── src/
    └── main/
        └── java/
            └── com/
                └── ejercicio/
                    ├── ordenarNumeros.java
```

---

## ⚙️ Requisitos

- ☕ **Java JDK 17+** (o 11 si tu entorno lo requiere)  
- 🛠️ **Maven** para compilar y ejecutar  

---

## ▶️ Compilación y ejecución

### 🔨 Compilar con Maven
```bash
mvn clean package
```

### 🎲 Ejecutar `aleatorios`
```bash
mvn exec:java -Dexec.mainClass="com.ejercicio.aleatorios"
```
Ejemplo de salida:
```
54 3 89 12 77 ...
```

### 🔢 Ejecutar `ordenarNumeros` (entrada manual)
```bash
mvn exec:java -Dexec.mainClass="com.ejercicio.ordenarNumeros"
```
Luego escribir en terminal:
```
5 2 8 1
```
Resultado:
```
1
2
5
8
```

### 📂 Redirección con archivos
```bash
mvn exec:java -Dexec.mainClass="com.ejercicio.aleatorios" > numeros.txt
mvn exec:java -Dexec.mainClass="com.ejercicio.ordenarNumeros" < numeros.txt
```

### 🔗 Tubería (|) entre programas
```bash
mvn exec:java -Dexec.mainClass="com.ejercicio.aleatorios" | mvn exec:java -Dexec.mainClass="com.ejercicio.ordenarNumeros"
```

---

## 🧪 Pruebas incluidas

- ✅ Generación de números aleatorios  
- ✅ Ordenación de entrada manual  
- ✅ Redirección de archivos (`>`, `<`)  
- ✅ Tubería (`|`) para conectar ambas aplicaciones  


---

## 📌 Conclusiones

🔹 Se han practicado conceptos básicos de Java (entrada/salida estándar, generación de números aleator
