# CondoManager

A native Android application developed in Kotlin to simulate a modern condominium management system. This project focuses on UI/UX implementation, layout structures, dynamic lists, and view navigation.

## 📱 Features

The application consists of 8 distinct screens mirroring the required project specifications:

1. **Login Screen:** Hardcoded authentication (`admin@admin.com` / `1234`) with input validation.
2. **Dashboard:** A central navigation hub using optimized `LinearLayout` grids.
3. **Bills List (Invoices):** Display of monthly condominium fees using `RecyclerView`.
4. **My Reservations:** A list showcasing common areas reserved by the resident.
5. **Visitor Authorization:** A structured form to register and authorize new visitors (Name, Document, and Apartment).
6. **Condo Wall:** An internal bulletin board displaying relevant building notices and announcements, featuring explicit back-navigation.
7. **Schedule Moving:** A registration form for scheduling move-in or move-out dates.
8. **Building Contacts:** A quick-access directory containing crucial administration and emergency contacts.

## 🛠️ Tech Stack & Architecture

* **Language:** Kotlin
* **UI Layouts:** XML (`ConstraintLayout` for responsive forms and `LinearLayout` for structured grids)
* **Components:** `RecyclerView` (with custom ViewHolders and Adapters for dynamic lists), `Toolbar`, and `EditText` validations.
* **Architecture Pattern:** Follows the traditional Android View-Controller structure, separating visual XML declarations from Kotlin behavioral logic.

## 🚀 How to Run the Project

1. Clone this repository to your local machine.
2. Open the project using **Android Studio (Ladybug or newer)**.
3. Wait for Gradle to finish syncing the project dependencies.
4. Clean and rebuild the project:
   * Go to `Build` > `Make Project` (or press `Ctrl + F9` / `Cmd + F9`).
5. Run the application on an Android Emulator or a physical device via USB Debugging (click the green **Run** triangle).

## 🔑 Test Credentials

To access the dashboard, use the following hardcoded credentials on the login screen:
* **Email:** `admin@admin.com`
* **Password:** `1234`
