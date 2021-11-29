package flyproject.flylib.bungeelib.api.chat.hover.content;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import flyproject.flylib.bungeelib.api.chat.HoverEvent;
import flyproject.flylib.bungeelib.api.chat.ItemTag;
import flyproject.flylib.bungeelib.api.chat.hover.content.Content;

@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class Item extends Content
{

    /**
     * Namespaced item ID. Will use 'minecraft:air' if null.
     */
    private String id;
    /**
     * Optional. Size of the item stack.
     */
    private int count = -1;
    /**
     * Optional. Item tag.
     */
    private ItemTag tag;

    @Override
    public HoverEvent.Action requiredAction()
    {
        return HoverEvent.Action.SHOW_ITEM;
    }
}
