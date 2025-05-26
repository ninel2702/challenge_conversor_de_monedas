# 💱 Conversor de Monedas en Java

En este proyecto se creo mi propio **Conversor de Monedas**, trabajando con APIs, datos JSON y desarrollando habilidades clave en Java.

---

## 🚀 Objetivo

Construir una aplicación en Java que:
- Consuma una API de tasas de cambio.
- Analice y manipule la respuesta JSON.
- Permita filtrar monedas de interés.
- Muestre los resultados de manera clara al usuario mediante un menú interactivo.
- Genere un historial de conversiones realizadas.
- Registre la fecha y hora de cada conversión.
- Formatee los resultados para mostrarlos con claridad.

---

## 🛠️ Tecnologías Requeridas


- **Java (JDK 17)**
- **IDE de preferencia** (ej. IntelliJ)
- **Librerías:**
  - `HttpURLConnection` (para consumo de API)
  - `java.time` (para fechas y horas)
  - `java.text.DecimalFormat` (formateo de decimales)
  - `Gson` (para manipulación de JSON)

> Se requiere conexión a internet para acceder a la API de divisas.

---

## 📋 Pasos del Challenge

1. **Configuración del entorno**  
   Verifica que el JDK esté correctamente instalado y funcionando.

2. **Estructura del proyecto**  
   Organiza el código en clases separadas siguiendo buenas prácticas.

3. **Consumo de la API**  
   Realiza una petición HTTP a una API pública como [ExchangeRate API](https://www.exchangerate-api.com/).

4. **Procesamiento de JSON**  
   Analiza la respuesta y extrae las tasas de cambio necesarias.

5. **Selección de monedas**  
   El usuario podrá elegir entre distintas monedas predefinidas.

6. **Visualización del resultado**  
   El resultado se muestra de manera clara y con decimales limitados.

7. **Historial con marca de tiempo**  
   Cada conversión se guarda junto con la fecha y hora de ejecución.
---


## 🧩 Estructura del Proyecto

- `Principal.java` – Clase principal con el menú de navegación.
- `Conversor.java` – Lógica de conversión matemática.
- `Moneda.java` – `record` para mapear la respuesta JSON.
- `ConvertidorApi.java` – Consume la API y devuelve los datos.
- `Conversion.java` – Representa una conversión con sus datos.
- `Historial.java` – Administra la lista de conversiones y su impresión.


## 📈 Monedas soportadas

La aplicación actualmente permite conversiones entre:

- USD ↔ MXN
- USD ↔ EUR
- USD ↔ JPY
- USD ↔ CAD
- USD ↔ NOK

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

### 5. Historial con fecha
El sistema mostrará todos los montos con la fecha que se consultaron el el programa:
![image](https://github.com/user-attachments/assets/7e359dab-4355-495c-92a1-c358aca649b0)



### 6. Salir
Al darle click al 7 el programa saldra del bucle y mostrara el texto de que se cerro la aplicación
![image](https://github.com/user-attachments/assets/864494c5-d266-4eaf-841f-2b01d21e9c70)




## 🧠 Notas Finales

- El proyecto sigue una lógica modular.
- El consumo de la API se realiza una sola vez por ejecución.
- Puedes expandir fácilmente el menú y añadir nuevas conversiones.



*Creado con 💻 por Ninel 🦝*
