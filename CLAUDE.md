# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## 저장소 성격

주차별 Java 입문 과제를 정리하는 학습 저장소입니다. 빌드 도구(Maven·Gradle)·테스트·린터가 없고, 각 파일이 `main` 하나짜리 독립 프로그램입니다. 주 작업 환경은 IntelliJ 이고 README 캡처도 IntelliJ Run 창 기준입니다.

## 실행

각 파일 맨 위에 `package weekNN;` 이 있으므로 **저장소 루트에서** 실행해야 합니다 (JDK 21, 단일 파일 실행).

```
java week10/HW10_2Continue.java
```

- `Scanner` 로 입력받는 파일(5주차 이후 다수)은 표준 입력이 필요합니다: `echo "1 2 0" | java week09/Week09.java`
- Bash 도구 출력에서는 한글이 깨져 보일 수 있습니다(콘솔 인코딩 문제). 숫자·영문으로 결과를 확인하고, README 에 옮길 땐 한글 문자열은 소스 기준으로 적습니다.

## 주차 폴더 구조와 이름 규칙

`weekNN/` 마다 같은 구성입니다.

- `WeekNN.java` — 수업 예제
- `HWN_M이름.java` — 과제 N-M (예: `HW10_2Continue.java` = 10-2)
- `CN이름.java` — 도전 과제 N
- `README.md` — 과제 문제 + 학생 답 + 실행 결과
- `images/N-M-K.png` — README 가 참조하는 실행 결과 캡처 (예: `10-2-1.png`)

새 주차는 `template/README.md` 를 바탕으로 만들고, 루트 `README.md` 의 "주차별 학습 기록" 표에 행을 추가합니다.

## README 작성 규칙

- README 에는 과제 출제 문구가 미리 들어 있습니다. **굵은 글씨 문항(`**조건 …**`, `**→ …**`)은 고치지 말고**, 그 바로 아래에 답을 적습니다. `예상:` · `멈춘 지점:` 같은 빈칸도 같은 방식으로 채웁니다.
- `#### - 실행 결과` 코드 블록에는 저장소 코드를 실제로 돌린 출력을 그대로 넣습니다. 제출 전 체크리스트에 "README 결과가 저장소 코드로 돌린 결과와 같은가" 항목이 있습니다.
- 문제에서 일부러 깨뜨려 보라고 한 실험(오류·무한 루프 등)은 최종 코드에서 **주석으로 남기고 옆에 오류 메시지를 적습니다** (예: `week04/HW4_5CastingErrors.java`). 최종 코드는 컴파일되고 끝나는 상태여야 합니다.
- 줄 끝에 공백 두 칸(마크다운 줄바꿈)을 쓰는 문체입니다. 표기는 `3 의 배수` 처럼 숫자·코드와 조사 사이를 띄웁니다.
- 각 주차 끝의 `## 제출 전 확인` 체크리스트는 완료 시 `[x]` 로 표시합니다.

## 편집 시 주의

사용자가 같은 파일을 IntelliJ·VS Code 에서 열어둔 채 작업합니다. 디스크의 README 를 직접 고치면 에디터에서 "content of the file is newer" 저장 충돌이 날 수 있으니, 고친 뒤 그 사실을 알려줍니다.

## 커밋 메시지

한국어, Conventional Commit 접두어를 씁니다. 주차마다 보통 이 순서입니다.

- `feat: N주차 코드 작성`
- `docs: N주차 과제 내용 및 실행 결과 작성`
- `docs: 주차별 학습 기록 표에 N주차 행 추가`
- `docs: N주차 제출 전 확인 체크리스트 완료 표시`
- `fix:` / `docs: N주차 피드백 반영`

## 작업 원칙

Behavioral guidelines to reduce common LLM coding mistakes.

**Tradeoff:** These guidelines bias toward caution over speed. For trivial tasks, use judgment.

> 이 저장소에는 테스트가 없습니다. 아래 4번의 "검증" 은 저장소 루트에서 `java weekNN/파일.java` 로 실행해 출력이 README 의 실행 결과·예상과 맞는지 확인하는 것으로 대신합니다.

### 1. Think Before Coding

**Don't assume. Don't hide confusion. Surface tradeoffs.**

Before implementing:

- State your assumptions explicitly. If uncertain, ask.
- If multiple interpretations exist, present them - don't pick silently.
- If a simpler approach exists, say so. Push back when warranted.
- If something is unclear, stop. Name what's confusing. Ask.

### 2. Simplicity First

**Minimum code that solves the problem. Nothing speculative.**

- No features beyond what was asked.
- No abstractions for single-use code.
- No "flexibility" or "configurability" that wasn't requested.
- No error handling for impossible scenarios.
- If you write 200 lines and it could be 50, rewrite it.

Ask yourself: "Would a senior engineer say this is overcomplicated?" If yes, simplify.

### 3. Surgical Changes

**Touch only what you must. Clean up only your own mess.**

When editing existing code:

- Don't "improve" adjacent code, comments, or formatting.
- Don't refactor things that aren't broken.
- Match existing style, even if you'd do it differently.
- If you notice unrelated dead code, mention it - don't delete it.

When your changes create orphans:

- Remove imports/variables/functions that YOUR changes made unused.
- Don't remove pre-existing dead code unless asked.

The test: Every changed line should trace directly to the user's request.

### 4. Goal-Driven Execution

**Define success criteria. Loop until verified.**

Transform tasks into verifiable goals:

- "Add validation" → "Write tests for invalid inputs, then make them pass"
- "Fix the bug" → "Write a test that reproduces it, then make it pass"
- "Refactor X" → "Ensure tests pass before and after"

For multi-step tasks, state a brief plan:

```
1. [Step] → verify: [check]
2. [Step] → verify: [check]
3. [Step] → verify: [check]
```

Strong success criteria let you loop independently. Weak criteria ("make it work") require constant clarification.

---

**These guidelines are working if:** fewer unnecessary changes in diffs, fewer rewrites due to overcomplication, and clarifying questions come before implementation rather than after mistakes.
