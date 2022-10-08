import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appContainerPage]'
})
export class ContainerPageDirective {

  constructor(private elementRef: ElementRef) {
    this.elementRef.nativeElement.style.marginTop = "0.5rem";
    this.elementRef.nativeElement.style.marginLeft = "2%";
    this.elementRef.nativeElement.style.marginRight = "2%";
  }

}
