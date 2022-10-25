import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appMarginLeftMd]'
})
export class MarginLeftMd {

  constructor(private elementRef: ElementRef) {
    this.elementRef.nativeElement.style.marginLeft = "20px";
  }

}
