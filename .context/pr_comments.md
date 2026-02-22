# PR Review - Batch payroll processing engine (by Amit Kumar)

## Reviewer: Neha Sharma
---

**Overall:** Good foundation but critical bugs need fixing before merge.

### `PayrollProcessor.java`

> **Bug #1:** Overtime calculation uses 8-hour base for all days including holidays which should be 0-hour base
> This is the higher priority fix. Check the logic carefully and compare against the design doc.

### `TaxCalculator.java`

> **Bug #2:** Tax bracket lookup uses wrong comparison at bracket boundaries causing edge case amounts to get wrong tax rate
> This is more subtle but will cause issues in production. Make sure to add a test case for this.

---

**Amit Kumar**
> Acknowledged. I have documented the issues for whoever picks this up.
