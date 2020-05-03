CREATE TABLE "account" (
  "first_name" varchar PRIMARY KEY,
  "password" varchar,
  "balance" int
);

CREATE TABLE "transaction" (
  "transaction_id" int PRIMARY KEY,
  "sender" varchar,
  "receiver" varchar,
  "ammount" int
);
