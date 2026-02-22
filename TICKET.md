# FINSERV-4122: Refactor batch payroll processing engine

**Status:** In Progress · **Priority:** High
**Sprint:** Sprint 24 · **Story Points:** 5
**Reporter:** Sneha Murthy (HR Systems Lead) · **Assignee:** You (Intern)
**Due:** End of sprint (Friday)
**Labels:** `backend`, `java`, `payroll`, `refactor`
**Task Type:** Code Maintenance

---

## Description

The payroll processor **works correctly** — it calculates salaries with tax, deductions, and overtime. The code has quality issues: tax bracket logic uses nested if-else chains, overtime calculation duplicates the regular pay formula, and there's no audit trail.

## Acceptance Criteria

- [ ] All `// TODO (code review):` items addressed
- [ ] Tax brackets extracted to configurable data structure
- [ ] Overtime calculation reuses base pay helper
- [ ] Audit trail added for each processed payslip
- [ ] All existing tests still pass
