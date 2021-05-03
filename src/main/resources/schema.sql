CREATE TABLE policy (
    id NUMBER AUTO_INCREMENT PRIMARY KEY,
    number TEXT NOT NULL,
    insurance_start_date DATE NOT NULL,
    insurance_end_date DATE NOT NULL,
    oc_value NUMERIC(20,2),
    ac_value  NUMERIC(20,2),
    nnw_value NUMERIC(20,2),
    glass_value NUMERIC(20,2),
    is_active boolean not null default true
);
