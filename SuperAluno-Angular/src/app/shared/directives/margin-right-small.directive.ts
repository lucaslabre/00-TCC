import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appMarginRightSm]'
})
export class MarginRightSm {

  constructor(private elementRef: ElementRef) {
    this.elementRef.nativeElement.style.marginRight = "10px";
  }

}
