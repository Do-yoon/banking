# EZpz — Open Banking Spending Tracker

> **2021 personal study project** — Korea Open Banking API (KFTC) integration with Spring Boot + React.
> Kept as-is as a snapshot of my early full-stack work; not actively maintained.

## What is EZpz?

Unexpected spending is hard to notice until it hurts. EZpz pulls your payment
history through the Open Banking API and **visualizes your spending pattern**
as graphs, with user-defined filters (e.g. "contains keyword", "exclude dates")
so you can slice the data your own way.

## Architecture

```
banking/
├── src/main/java/com/doyoon/openbanking/   # Spring Boot backend
│   ├── oauth/    # OAuth 2.0 flow against the KFTC Open Banking API
│   ├── user/     # sign-in / user management (Controller · Service · Repository)
│   └── index/    # entry endpoints
└── frontend/     # React SPA (craco), components / pages / util
```

- **Backend** — Spring Boot (Gradle). Handles the KFTC OAuth 2.0 authorization
  flow and exposes REST endpoints consumed by the frontend.
- **Frontend** — React with `craco` for path aliasing. Renders payment history
  and user-defined filter graphs. See [frontend/README.md](/frontend/README.md).
- **External API** — [Open Banking API](https://www.openbanking.or.kr/) by KFTC
  (Korea Financial Telecommunications & Clearings Institute).

## Tech Stack

Java · Spring Boot · Gradle · React · craco

## Run

```bash
# backend
./gradlew bootRun

# frontend
cd frontend && npm install && craco start
```
