# 💱 Conversor de Monedas en Java

En este proyecto se creo mi propio **Conversor de Monedas**, trabajando con APIs, datos JSON y desarrollando habilidades clave en Java.

---

## 🚀 Objetivo

Construir una aplicación en Java que:
- Consuma una API de tasas de cambio.
- Analice y manipule la respuesta JSON.
- Permita filtrar monedas de interés.
- Muestre los resultados de manera clara al usuario con menu interactivo.

---

## 🛠️ Tecnologías Requeridas

- **Java (se utilizo el JDK 17)**
- **IDE de tu preferencia** (IntelliJ)
- **Librería HTTP y JSON (como HttpURLConnection y GSON)**
- Conexión a internet para acceder a la API de cambio de divisas.

---

## 📋 Pasos del Challenge

1. **Configuración del Ambiente Java**  
   Asegúrate de tener el JDK instalado y funcionando correctamente.

2. **Creación del Proyecto**  
   Estructura tu proyecto en paquetes según buenas prácticas.

3. **Consumo de la API**  
   Realiza solicitudes HTTP a una API pública de tasas de cambio (por ejemplo: [ExchangeRate API](https://www.exchangerate-api.com/)).

4. **Análisis de la Respuesta JSON**  
   Procesa la respuesta de la API para extraer la información relevante.

5. **Filtro de Monedas**  
   Permite al usuario seleccionar o filtrar las monedas de interés.

6. **Exhibición de Resultados**  
   Muestra los resultados en consola o interfaz (opcional) de forma clara y amigable.

---


## 🧩 Estructura del Proyecto

- `Principal.java` – Clase principal con menú interactivo.
- `Conversor.java` – Contiene la lógica matemática para convertir divisas.
- `Moneda.java` – Record para mapear la respuesta JSON.
- `ConvertidorApi.java` – Consume la API y devuelve los datos mapeados.

## 📈 Monedas soportadas

La aplicación actualmente permite conversiones entre:

- USD ↔ MXN
- USD ↔ EUR
- USD ↔ JPY

Puedes agregar más divisas editando los `Currency Codes` usados.

## 📥 Instrucciones para Ejecutar

1. Clona o descarga el proyecto.
2. Asegúrate de tener configurado Java y tu entorno de desarrollo.
3. Ejecuta el archivo `Principal.java`.
4. Usa el menú numérico para seleccionar la conversión que deseas.
5. Ingresa el monto y visualiza el resultado en pantalla.

## 🖼️ Instrucciones de Uso (con capturas)

A continuación, se detallan los pasos que un usuario debe seguir para usar el programa. Puedes añadir tus propias capturas de pantalla para ilustrar cada punto.

### 1. Menú Principal
Al iniciar la aplicación, verás un menú con opciones de conversión:
![image](https://github.com/user-attachments/assets/a03f1873-7aad-4301-888d-09cde40bc390)


### 2. Selección de Opción
Selecciona el número de la conversión deseada:
![image](https://github.com/user-attachments/assets/a5a2f9c6-465a-4879-a9e2-280b5af0b794)


### 3. Ingreso de Valor
Ingresa el valor numérico que deseas convertir:
![image](https://github.com/user-attachments/assets/bde2e4db-e999-4d33-bec2-bab3d2f51d54)


### 4. Resultado
El sistema mostrará el monto convertido usando la tasa más actual:
![image](https://github.com/user-attachments/assets/8faae081-9b6f-4a3b-b618-14726d40ebf0)


### 5. Salir
Al darle click al 7 el programa saldra del bucle y mostrara el texto de que se cerro la aplicación
![image](https://github.com/user-attachments/assets/864494c5-d266-4eaf-841f-2b01d21e9c70)




## 🧠 Notas Finales

- El proyecto sigue una lógica modular.
- El consumo de la API se realiza una sola vez por ejecución.
- Puedes expandir fácilmente el menú y añadir nuevas conversiones.



Ninel 🦝
