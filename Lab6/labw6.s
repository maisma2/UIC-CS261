    .file  "labw6.s"
    .text
    .globl  main

func:
    endbr64
    pushq   %rbp               /* Q3.2 */
    movq    %rsp, %rbp
    subq    $32, %rsp          /* Q3.3 */     
    movl    $100, -4(%rbp)
    addl    $28, -4(%rbp)
    movw    $4096, -6(%rbp) 
    movw    -6(%rbp), %ax
    shrw    $2, %ax
    movw    %ax, -6(%rbp)
    movb    $63, -7(%rbp)
    negb    -7(%rbp)           /* Q3.4 */
    movq    $1000, -32(%rbp)
    movq    -32(%rbp), %rax    /* Q3.5 */ 
    movq    %rax, -16(%rbp)
    leaq    -32(%rbp), %rax    /* Q3.5 */ 
    movq    %rax, -24(%rbp)
    addq    $32, %rsp     
    popq    %rbp
    retq

main:
    endbr64
    pushq   %rbp
    movq    %rsp, %rbp
    movl    $0, %eax
    call    func
    movl    $0, %eax
    popq    %rbp
    retq
