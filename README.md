# **LOOPCOMMERCE (E-Commerce Console Simulator)**

---

# 🎯 **Descripción General**

En esta actividad, cada equipo desarrollará una aplicación de consola llamada **LoopCommerce**, que simula las operaciones básicas de un e-commerce.

El objetivo es demostrar dominio de:

- `while`
- `do-while`
- `for`
- `foreach`
- uso de **Scanner**
- manejo de variables, operadores y control de flujo

El proyecto debe subirse a **GitHub**, con su respectivo **README**, `.gitignore` y commits con convenciones.

---

# 🎓 **Objetivos de Aprendizaje**

Al finalizar esta tarea, cada grupo habrá practicado:

✔ Interacción con el usuario usando Scanner

✔ Flujo de menú utilizando un `do-while`

✔ Uso de loops de manera contextual y correcta

✔ Organización básica de un proyecto

✔ Trabajo colaborativo usando Git y GitHub

✔ Escritura de documentación técnica mínima

---

# 🛒 **Enunciado**

Cada grupo deberá construir un programa llamado:

```
LoopCommerce.java
```

que simule un mini e-commerce por consola.

El sistema debe incluir **5 acciones principales**:

### 1) **Ver productos disponibles**

- Los productos deben almacenarse en un **arreglo de Strings**.
- Recorrerlos usando **for-each**.
- Mostrar su número y precio.

---

### 2) **Agregar productos al carrito**

- Usar un `while` para permitir agregar varios productos hasta que el usuario ingrese “0”.
- Cada producto debe sumar un valor al subtotal.
- El subtotal debe acumularse en una variable.

---

### 3) **Ver subtotal actual**

- Mostrar el monto acumulado del carrito.

---

### 4) **Realizar checkout**

- Simular un proceso de compra en **4 pasos fijos**, usando un `for`:
    1. Validación de stock
    2. Confirmación de datos
    3. Procesamiento de pago
    4. Generación de envío

Cada paso debe imprimirse con un mensaje.

---

### 5) **Salir del sistema**

- Usar un **do-while** para que el menú vuelva a mostrarse hasta que el usuario elija “Salir”.

---

# 🧩 **Requerimientos Técnicos Obligatorios**

## 🔸 Uso de loops

Debes incluir **OBLIGATORIAMENTE**:

| Loop | Debe usarse en… |
| --- | --- |
| do-while | Menú principal |
| foreach | Listar productos |
| while | Agregar productos al carrito |
| for | Proceso de checkout |

---

## 🔸 Uso de Scanner

Se debe utilizar para:

- Leer opciones del menú
- Leer productos seleccionados

---

## 🔸 Variables y Operadores

Usar:

✔ Variables numéricas

✔ Acumuladores

✔ Operadores aritméticos

✔ Operadores lógicos

✔ Mínimo un `if/else`

---

## 🔸 Sin funciones ni POO

Todo el código debe estar dentro de **main**, porque aún no se enseña modularización.

---

# 📁 **Estructura mínima del repositorio**

```
loopcommerce/
│
├── .gitignore
├── README.md
└── LoopCommerce.java
```

---

# 📝 **Contenido obligatorio del README**

El archivo `README.md` debe incluir:

## ✔ 1. Título del proyecto

```
# LoopCommerce - E-Commerce Simulator (Consola en Java)

```

## ✔ 2. Descripción breve del desafío

## ✔ 3. Tecnologías usadas

- Java 21
- Scanner
- Loops (for, foreach, while, do-while)

## ✔ 4. Cómo ejecutar el proyecto

Ejemplo:

```
javac LoopCommerce.java
java LoopCommerce
```

## ✔ 5. Funcionalidades del programa

Explicar cada opción del menú.

## ✔ 6. Roles del equipo (Opcional)

Ejemplo:

- Integrante 1: Menú principal (do-while)
- Integrante 2: Agregar productos (while)
- Integrante 3: Listar productos (foreach)
- Integrante 4: Checkout (for)

## ✔ 7. Aprendizajes del equipo

Reflexión breve.

---

# 🧼 **.gitignore Obligatorio**

Agregar al repositorio un archivo `.gitignore` con al menos:# LOOPCOMMERCE-E-Commerce-Console-Simulator-